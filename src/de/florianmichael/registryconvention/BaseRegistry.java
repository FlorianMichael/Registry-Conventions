/*
 * Copyright (c) FlorianMichael as EnZaXD 2022
 * Created on 28.03.22, 15:27
 *
 * --FLORIAN MICHAEL KIND LICENCE v1.0--
 *
 * It is allowed to use this project for anything.
 */

package de.florianmichael.registryconvention;

import de.florianmichael.registryconvention.exception.ListFuncError;
import de.florianmichael.registryconvention.listener.IAddListener;
import de.florianmichael.registryconvention.listener.IRemoveListener;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Basic Registry with Listeners for Add and Remove
 *
 * @param <T> Instance of Object you want to save
 */
public class BaseRegistry<T> {

    /**
     * Just the Object List where we put all objects
     */
    private final List<T> objects = new CopyOnWriteArrayList<>();

    /**
     * Instance of the Add Listener
     */
    private IAddListener<T> addListener;

    /**
     * Instance of the Remove Listener
     */
    private IRemoveListener<T> removeListener;

    /**
     * 'add(T T)' Wrapper for multiply instances
     *
     * @param ts Array of T Object
     */
    public void add(final T... ts) throws ListFuncError {
        for (T t : ts)
            this.add(t);
    }

    /**
     * Final method to add anything to the registry
     * @param t Instance of the Object
     */
    public void add(final T t) throws ListFuncError {
        if (this.getObjects().contains(t))
            throw new ListFuncError("We can't do this");

        this.getObjects().add(t);

        if (this.getAddListener() != null)
            this.getAddListener().add(t);
    }

    /**
     * Final method to remove anything to the registry
     * @param t Instance of the Object
     */
    public void remove(final T t) throws ListFuncError {
        if (!this.getObjects().contains(t))
            throw new ListFuncError("We can't do this");

        this.getObjects().remove(t);

        if (this.getRemoveListener() != null)
            this.getRemoveListener().remove(t);
    }

    // Some getter

    public List<T> getObjects() {
        return objects;
    }

    public IAddListener<T> getAddListener() {
        return addListener;
    }

    public void setAddListener(final IAddListener<T> addListener) {
        this.addListener = addListener;
    }

    public IRemoveListener<T> getRemoveListener() {
        return removeListener;
    }

    public void setRemoveListener(final IRemoveListener<T> removeListener) {
        this.removeListener = removeListener;
    }
}
