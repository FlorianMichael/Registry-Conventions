/*
 * Copyright (c) FlorianMichael as EnZaXD 2022
 * Created on 28.03.22, 15:41
 *
 * --FLORIAN MICHAEL KIND LICENCE v1.0--
 *
 * It is allowed to use this project for anything.
 */

package de.florianmichael.registryconvention.nameable;

import de.florianmichael.registryconvention.exception.ListFuncError;

/**
 * This is just a Wrapper for non-exception handling
 * @param <T> Object of the Storage
 */
public class CatchableNameableRegistry<T extends IStringNameable> extends NameableRegistry<T> {

    /**
     * Wrapper for Exceptions
     * @param t T of Registry
     */
    public void addC(final T t) {
        try {
            this.add(t);
        } catch (ListFuncError e) {
            e.printStackTrace();
        }
    }

    /**
     * Wrapper for Exceptions
     * @param t T of Registry
     */
    public void removeC(final T t) {
        try {
            this.remove(t);
        } catch (ListFuncError e) {
            e.printStackTrace();
        }
    }
}
