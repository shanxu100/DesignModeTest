package Command;

/**
 * Created by guan on 9/24/16.
 */
public class Cmd1 extends Cmd {
    public Cmd1(Executor executor) {
        super(executor);
    }

    @Override
    protected void ExecuteCmd() {
        System.out.println("Cmd1: ExecuteCmd======");
        executor.Execute(this.getClass().getSimpleName());
    }
}
