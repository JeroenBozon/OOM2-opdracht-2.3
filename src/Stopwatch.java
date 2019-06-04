public class Stopwatch {

	private StopwatchState state;

	public void start() {
		state.start(this);
	}

	public void stop() {
		state.stop(this);
	}

	public void reset() {
		state.reset(this);
	}

	public void lap() {
		state.lap(this);
	}

	public void on() {
		state.on(this);
	}

	public void off() {
		state.off(this);
	}

	public void changeState(StopwatchState state){
		this.state = state;
	}
}