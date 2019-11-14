package domain;

import java.util.Date;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
abstract class Message<T> {

    @Getter private final UserId sourceId;
    @Getter private final T targetId;
    @Getter private final String text;
    @Getter private final Date sentAt;

}