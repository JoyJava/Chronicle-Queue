package net.openhft.chronicle.queue.impl.single;

import net.openhft.chronicle.core.Jvm;
import org.junit.Ignore;
import org.junit.Test;

public class RollCycleMultiThreadStressPretouchTest extends RollCycleMultiThreadStressTest {

    @Ignore("run manually")
    @Test
    public void repeatStress() throws InterruptedException {
        Jvm.setExceptionHandlers(null, null, null);
        for (int i = 0; i < 100; i++) {
            stress();
        }
    }

    @Test
    public void stress() throws InterruptedException {
        System.setProperty("pretouch", "true");
        super.stress();
    }
}