import javax.batch.api.AbstractBatchlet;
import javax.inject.Named;

@Named
public class Batch2 extends AbstractBatchlet {

    @Override
    public String process() {
        System.out.println("Running inside a batchlet : Batch2");
        // TODO code application logic here
        return "COMPLETED";
    }

}
