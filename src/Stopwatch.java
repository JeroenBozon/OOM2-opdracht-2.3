public class Stopwatch {

	private StopwatchState state;
	private double hour;
	private double minute;

	public void start() {
		// TODO - implement Stopwatch.start
		state.start();
	}

	public void stop() {
		// TODO - implement Stopwatch.stop
		state.stop();
	}

	public void reset() {
		// TODO - implement Stopwatch.reset
		state.reset();
	}

	public void lap() {
		// TODO - implement Stopwatch.lap
		state.lap();
	}

	public void on() {
		// TODO - implement Stopwatch.on
		state.on();
	}

	public void off() {
		// TODO - implement Stopwatch.off
		state.off();
	}

	public void changeState(StopwatchState state){
		this.state = state;

	}
}