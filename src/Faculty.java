/**
 * Created by neuma on 03.03.2017.
 */
public class Faculty {

    public int faculty(int fac){
        if (fac == 0)
            return 1;
        return (fac * faculty(fac-1));
    }
}
