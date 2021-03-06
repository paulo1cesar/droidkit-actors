package com.droidkit.actors.dispatch;

import static com.droidkit.actors.ActorTime.currentTime;

/**
 * RunnableDispatcher is MessageDispatcher implementation for executing
 * various Runnable
 * <p/>
 * Author: Stepan Ex3NDR Korshakov (me@ex3ndr.com, telegram: +7-931-342-12-48)
 */
public class RunnableDispatcher extends AbstractDispatcher<Runnable> {
    @Override
    protected void dispatchAction(Runnable object) {
        object.run();
    }

    public void postAction(Runnable action) {
        postAction(action, 0);
    }

    public void postAction(Runnable action, long delay) {
        getQueue().putToQueue(action, currentTime() + delay);
    }
}