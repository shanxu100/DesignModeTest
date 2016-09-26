package Command;

/**
 * Created by guan on 9/24/16.
 */
public class Cmd2 extends Cmd {
    public Cmd2(Executor executor) {
        super(executor);
    }

    @Override
    protected void ExecuteCmd() {
        System.out.println("Cmd2: ExecuteCmd======");
        executor.Execute(this.getClass().getSimpleName());
    }
}
