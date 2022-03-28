/*
 * Copyright (c) FlorianMichael as EnZaXD 2022
 * Created on 28.03.22, 15:40
 *
 * --FLORIAN MICHAEL PRIVATE LICENCE v1.0--
 *
 * This file / project is protected and is the intellectual property of Florian Michael (aka. EnZaXD),
 * any use (be it private or public, be it copying or using for own use, be it publishing or modifying) of this
 * file / project is prohibited. It requires in that use a written permission with official signature of the owner
 * "Florian Michael". "Florian Michael" receives the right to control and manage this file / project. This right is not
 * cancelled by copying or removing the license and in case of violation a criminal consequence is to be expected.
 * The owner "Florian Michael" is free to change this license.
 */

package de.florianmichael.registryconvention.nameable;

import de.florianmichael.registryconvention.BaseRegistry;

public class NameableRegistry<T extends IStringNameable> extends BaseRegistry<T> {

    public T getByName(final String name, final boolean ignoreCase) {
        return this.getObjects().stream().filter(t -> (ignoreCase && t.name().equalsIgnoreCase(name) || t.name().equals(name))).findFirst().orElse(null);
    }
}
