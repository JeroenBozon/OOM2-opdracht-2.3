public abstract class StopwatchState {

	public abstract void start();

	public abstract void stop();

	public void reset() {}

	public void lap() {}

	public abstract void on();

	public abstract void off();

}