
import org.apache.commons.lang.StringUtils;
import com.siqiansoft.platform.view.bo.biz.PackageBo;
import java.text.SimpleDateFormat;
import java.util.*;

public class test {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月");
        System.out.println(sdf.format(date));

    }
}
