package Command;

/**
 * Created by guan on 9/24/16.
 */
public abstract class Cmd {
    Executor executor;

    public Cmd(Executor executor)
    {
        this.executor=executor;
    }

    protected abstract void ExecuteCmd();
}
