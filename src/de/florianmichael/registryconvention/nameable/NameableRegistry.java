/*
 * Copyright (c) FlorianMichael as EnZaXD 2022
 * Created on 28.03.22, 15:40
 *
 * --FLORIAN MICHAEL KIND LICENCE v1.0--
 *
 * It is allowed to use this project for anything.
 */

package de.florianmichael.registryconvention.nameable;

import de.florianmichael.registryconvention.BaseRegistry;

public class NameableRegistry<T extends IStringNameable> extends BaseRegistry<T> {

    public T getByName(final String name, final boolean ignoreCase) {
        return this.getObjects().stream().filter(t -> (ignoreCase && t.name().equalsIgnoreCase(name) || t.name().equals(name))).findFirst().orElse(null);
    }
}
