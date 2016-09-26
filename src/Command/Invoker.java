package Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guan on 9/24/16.
 */
public class Invoker {

    List<Cmd> CmdList=new ArrayList<>();

    public void Notify()
    {
        for (Cmd cmd: CmdList)
        {
            cmd.ExecuteCmd();
        }
    }


}
