package designPatterns.exercises.n7_bombing;

import java.util.ArrayList;
import java.util.List;

import designPatterns.exercises.n7_bombing.library.Coordinate;
import designPatterns.exercises.n7_bombing.logic.And;
import designPatterns.exercises.n7_bombing.logic.False;
import designPatterns.exercises.n7_bombing.logic.IsAttacking;
import designPatterns.exercises.n7_bombing.logic.Logic;
import designPatterns.exercises.n7_bombing.logic.Not;
import designPatterns.exercises.n7_bombing.logic.Or;
import designPatterns.exercises.n7_bombing.logic.True;
import designPatterns.exercises.n7_bombing.numbers.GetDamaged;
import designPatterns.exercises.n7_bombing.numbers.LiteralNumber;
import designPatterns.exercises.n7_bombing.numbers.Number;
import designPatterns.exercises.n7_bombing.relationals.Equals;
import designPatterns.exercises.n7_bombing.relationals.Greater;
import designPatterns.exercises.n7_bombing.sentences.CompositeSentence;
import designPatterns.exercises.n7_bombing.sentences.DoWhile;
import designPatterns.exercises.n7_bombing.sentences.For;
import designPatterns.exercises.n7_bombing.sentences.If;
import designPatterns.exercises.n7_bombing.sentences.Print;
import designPatterns.exercises.n7_bombing.sentences.Sentence;
import designPatterns.exercises.n7_bombing.sentences.While;
import designPatterns.exercises.n7_bombing.sentences.tank.FireBullets;
import designPatterns.exercises.n7_bombing.sentences.tank.FireMissile;
import designPatterns.exercises.n7_bombing.sentences.tank.FireSmoke;
import designPatterns.exercises.n7_bombing.sentences.tank.MoveTo;
import designPatterns.exercises.n7_bombing.sentences.tank.Turn;

public class ScriptBuilder {

	private Tank tank;
	
	private Target target;
	
	private List<CompositeSentence> compositeSentencePile;
	
	private CompositeSentence compositeSentence;

	public ScriptBuilder(Tank tank, Target target) {
		this.tank = tank;
		this.target = target;
		compositeSentencePile = new ArrayList<CompositeSentence>();
		compositeSentence = new CompositeSentence();
		compositeSentencePile.add(0, compositeSentence);
	}

	public Sentence build() {
		return compositeSentence;
	}

	private void push(CompositeSentence compositeSentence) {
		this.add(compositeSentence);
		compositeSentencePile.add(0, compositeSentence);
	}

	private void add(Sentence sentence) {
		compositeSentencePile.get(0).add(sentence);
	}

	private void pop() {
		compositeSentencePile.remove(0);
	}

	public void IF(Logic condition) {
		this.push(new If(condition));
	}
	
	public void ELSE(){
		If ifSentence = (If)compositeSentencePile.get(0);
		this.pop();
		compositeSentencePile.add(0,ifSentence.getElse());
	}

	public void ENDIF() {
		this.pop();
	}

	public void FOR(int times) {
		this.push(new For(times));
	}

	public void ENDFOR() {
		this.pop();
	}

	public void WHILE(Logic logic) {
		this.push(new While(logic));
	}

	public void ENDWHILE() {
		this.pop();
	}

	public void DOWHILE(Logic logic) {
		this.push(new DoWhile(logic));
	}

	public void ENDDOWHILE() {
		this.pop();
	}

	public void PRINT(String string) {
		this.add(new Print(string));
	}
	
	public void MOVE_TO(Coordinate coordinate, int minutes){
		this.add(new MoveTo(tank, coordinate, minutes));
	}
	
	public void TURN(int grades){
		this.add(new Turn(tank, grades));
	}
	
	public void FIRE_SMOKE(){
		this.add(new FireSmoke(tank));
	}
	
	public void FIRE_BULLET(){
		this.add(new FireBullets(tank));
	}
	
	public void FIRE_MISSILE(){
		this.add(new FireMissile(tank));
	}	
	
	public Logic NOT(Logic condition){
		return new Not(condition);
	}

	public Logic AND(Logic leftCondition, Logic rightCondition) {
		return new And(leftCondition, rightCondition);
	}
	
	public Logic OR(Logic leftCondition, Logic rightCondition) {
		return new Or(leftCondition, rightCondition);
	}

	public Logic TRUE() {
		return new True();
	}
	
	public Logic FALSE() {
		return new False();
	}
	
	public Logic IS_ATTACKING() {
		return new IsAttacking(target);
	}

	public Number LITERAL(int value) {
		return new LiteralNumber(value);
	}

	public Number GET_DAMANGE() {
		return new GetDamaged(target);
	}

	public Logic GREATER(Number leftNumber, Number rightNumber) {
		return new Greater(leftNumber, rightNumber);
	}
	
	public Logic EQUALS(Number leftNumber, Number rightNumber) {
		return new Equals(leftNumber, rightNumber);
	}
	
}
