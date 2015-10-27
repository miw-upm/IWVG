package chess;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private String title;
	
	private List<Option> options;
	
	private ExitOption exitOption;
	
	protected Menu(String title) {
		this.title = title;
		options = new ArrayList<Option>();
	}
	
	public void add(Option option){
		options.add(option);
	}
	
	public void close(){
		exitOption = new ExitOption();
		this.add(exitOption);
	}
	
	public void exec(){
		IO io = new IO();
		do {
			io.writeln(title);
			for(int i=0; i<options.size(); i++){
				io.write(i+1+"."+options.get(i).getTitle());
			}
			int option = new LimitedIntDialog("Option?", 1, options.size()).read();
			options.get(option).exec();
		} while (!exitOption.isExecuted());
	}
}
