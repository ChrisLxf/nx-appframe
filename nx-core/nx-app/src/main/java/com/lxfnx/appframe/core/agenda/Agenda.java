package com.lxfnx.appframe.core.agenda;

/**
 * 执行议程
 *
 * @author lixiaofeng
 * @date 2021/2/22 3:17 下午
 **/
public interface Agenda {


    /**
     * 议程是否为空
     */
    boolean isEmpty();

    /**
     * 获取下一个线程
     *
     * @return 可执行线程
     */
    Runnable getNextOperation();

    /**
     * 议程中需要执行线程
     */
    void planOperation(Runnable operation);
}