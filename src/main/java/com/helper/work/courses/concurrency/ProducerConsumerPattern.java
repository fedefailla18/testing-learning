package com.helper.work.courses.concurrency;

import java.lang.reflect.Array;

import static org.springframework.util.ObjectUtils.isEmpty;

public class ProducerConsumerPattern {

    private static final int BUFFER_SIZE = 100;

    int count = 0;
    int[] buffer = new int[BUFFER_SIZE];

    class Producer {
        public void producer() {
            while (isFull(buffer)) {

            }
            buffer[count++] = 1;
        }

        private boolean isFull(int[] buffer) {
            return Array.getLength(buffer) == count;
        }
    }

    class Consumer {
        public void consumer() {
            while (isEmpty(buffer)) {

            }
            buffer[--count] = 0;
        }
    }
}
