package org.kin.kafka.multithread.concurrent;

/**
 * Created by huangjianqin on 2017/10/26.
 */
@FunctionalInterface
public interface Partitioner<K> {
    int toPartition(K key, int numPartition);
}
