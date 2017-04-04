class mancala extends pit {

	public mancala() {}

	public boolean setNext(pit _next) {
		if (_next == null) {
			return false;
		} else {
			next = _next;
			return true;
		}
	}

	//Not very good idea this but oh well I'll change it in the future
	public boolean makeMove() throws Exception {
		throw new Exception("Cannot be done");
		//return false;
	}

	public boolean passOn(int _stones) {
		++stones;
		--_stones;

		if (_stones == 0) {
			return true;
		} else
			return next.passOn(stones);
	}
}