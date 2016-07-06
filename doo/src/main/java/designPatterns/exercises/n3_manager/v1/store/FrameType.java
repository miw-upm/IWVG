package designPatterns.exercises.n3_manager.v1.store;

public enum FrameType {
	ADD,
	REMOVE,
	EXIST,
	LIST,
	CLOSE;

	public static FrameType parser(String string) {
		for(FrameType frameType : FrameType.values()) {
			if (frameType.name().equals(string)) {
				return frameType;
			}
		}
		return null;
	}
}
