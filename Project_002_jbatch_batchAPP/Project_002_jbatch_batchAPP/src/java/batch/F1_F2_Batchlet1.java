package batch;

import javax.batch.api.AbstractBatchlet;
import javax.inject.Named;

@Named
public class F1_F2_Batchlet1 extends AbstractBatchlet {

    @Override
    public String process() {
        System.out.println("Running inside a batchlet : F1_F2_Batchlet1");
        // TODO code application logic here
        return "COMPLETED";
    }

}
