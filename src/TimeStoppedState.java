public class TimeStoppedState extends StopwatchState {

	public void reset(Stopwatch stopwatch) {
		System.out.println("RESET");
	}

	public void stop(Stopwatch stopwatch) {
		System.out.println("STOP");
	}

	public void off(Stopwatch stopwatch) {
		System.out.println("OFF");
	}

	public void start(Stopwatch stopwatch) {
		stopwatch.changeState(new TimeRunningState());
		System.out.println("START");
	}

}