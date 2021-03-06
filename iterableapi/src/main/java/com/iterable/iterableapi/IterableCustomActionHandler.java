package com.iterable.iterableapi;

import androidx.annotation.NonNull;

/**
 * Custom action handler interface
 */
public interface IterableCustomActionHandler {

    /**
     * Callback called for custom actions from push notifications
     * @param action {@link IterableAction} object containing action payload
     * @param actionContext  The action context
     * @return Boolean value. Reserved for future use.
     */
    boolean handleIterableCustomAction(@NonNull IterableAction action, @NonNull IterableActionContext actionContext);

}
