abstract class pit {
	protected int stones;
	protected pit next;

	public abstract boolean setNext(pit _next);

	//Remove this is one of the two children classes won't use it
	public abstract boolean makeMove() throws Exception;

	public abstract boolean passOn(int _stones);
}