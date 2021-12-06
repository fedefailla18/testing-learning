package com.helper.work.courses.concurrency;

import java.lang.reflect.Array;

import static org.springframework.util.ObjectUtils.isEmpty;

public class ProducerConsumerPattern {

    private static final int BUFFER_SIZE = 100;

    int count = 0;
    int[] buffer = new int[BUFFER_SIZE];

    private Object lock;

    class Producer {
        public void producer() throws InterruptedException {
            synchronized (lock) {
                if (isFull(buffer)) {
                    lock.wait();
                }
                buffer[count++] = 1;
                lock.notifyAll();
            }
        }

        private boolean isFull(int[] buffer) {
            return Array.getLength(buffer) == count;
        }
    }

    class Consumer {
        public void consumer() throws InterruptedException {
            synchronized (lock) {
                if (isEmpty(buffer)) {
                    lock.wait();
                }
                buffer[--count] = 0;
lock.notifyAll();
            }
        }
    }
}
