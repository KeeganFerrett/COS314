class playerPit extends pit {

	public playerPit(int _stones) {
		stones = _stones;
	}

	public boolean setNext(pit _next) {
		if (_next == null) {
			return false;
		} else {
			next = _next;
			return true;
		}
	}

	public boolean makeMove() throws Exception{
		if (stones == 0) {
			throw new Exception("Empty Pit. Cannot Make A Move");
		}
		boolean another = passOn(stones);
		stones = 0;
		return another;
	}

	public boolean passOn(int _stones) {
		++stones;
		--_stones;

		if (_stones == 0) {
			return false;
		} else
			return next.passOn(stones);
	}
}