import javax.batch.api.AbstractBatchlet;
import javax.inject.Named;

@Named
public class Batch3 extends AbstractBatchlet {

    @Override
    public String process() {
        System.out.println("Running inside a batchlet : Batch3");
        // TODO code application logic here
        return "COMPLETED";
    }

}
