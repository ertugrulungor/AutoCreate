package com.github.ertugrulungor.creators;

import com.github.ertugrulungor.enums.CreationType;

public interface ValueCreator<T> {
    T create(CreationType creationType);
}
