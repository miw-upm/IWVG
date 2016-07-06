package designPatterns.exercises.n3_manager.v2.store;

public enum FrameType {
	ADD,
	REMOVE,
	EXIST,
	LIST,
	CLOSE,
	ACK;

	public static FrameType parser(String string) {
		for(FrameType frameType : FrameType.values()) {
			if (frameType.name().equals(string)) {
				return frameType;
			}
		}
		return null;
	}
}
