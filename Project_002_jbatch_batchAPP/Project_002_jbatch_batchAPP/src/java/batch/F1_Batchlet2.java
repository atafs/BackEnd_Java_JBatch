package batch;

import javax.batch.api.AbstractBatchlet;
import javax.inject.Named;

@Named
public class F1_Batchlet2 extends AbstractBatchlet {

    @Override
    public String process() {
        System.out.println("Running inside a batchlet : F1_Batchlet2");
        // TODO code application logic here
        return "COMPLETED";
    }

}
