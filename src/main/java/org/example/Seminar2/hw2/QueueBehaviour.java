package org.example.Seminar2.hw2;

public interface QueueBehaviour {
    void takeInQueue(Buyer actor);
    void takeOrder(String takeAc);
    void giveOrder(Buyer actor);
    void releaseFromQueue(String takeAc);
}
