/*
 * Copyright (c) FlorianMichael as EnZaXD 2022
 * Created on 28.03.22, 15:30
 *
 * --FLORIAN MICHAEL KIND LICENCE v1.0--
 *
 * It is allowed to use this project for anything.
 */

package de.florianmichael.registryconvention.listener;

/**
 * Listener for adding an element to a registry
 * @param <T> Instance of the element
 */
public interface IAddListener<T> {

    /**
     * We call this if we add an element to the list
     * @param t Instance of the element
     */
    void add(T t);

}
