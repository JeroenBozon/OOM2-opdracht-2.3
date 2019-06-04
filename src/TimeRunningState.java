public class TimeRunningState extends StopwatchState {

	public void lap(Stopwatch stopwatch) {
		System.out.println("LAP");
	}

	public void start(Stopwatch stopwatch) {
		System.out.println("START");
	}

	public void stop(Stopwatch stopwatch) {
		stopwatch.changeState(new TimeStoppedState());
		System.out.println("STOP");
	}

	public void on(Stopwatch stopwatch) {
		System.out.println("ON");
	}

	public void off(Stopwatch stopwatch) {
		System.out.println("OFF");
	}

}