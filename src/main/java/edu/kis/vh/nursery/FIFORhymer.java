package edu.kis.vh.nursery;

import edu.kis.vh.nursery.Containers.IntArrayStack;
import edu.kis.vh.nursery.Containers.IntContainer;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer(new IntArrayStack());

    public FIFORhymer() {}
    public FIFORhymer(IntContainer intContainer) {
        super(intContainer);
    }

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());
        int ret = temp.countOut();
        while (!temp.callCheck())
            countIn(temp.countOut());
        return ret;
    }
}
