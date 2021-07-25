package com.company.lesson8.lesson.test.lombockTest;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

//@AllArgsConstructor
//@RequiredArgsConstructor
//@NoArgsConstructor

//@Getter
//@Setter

//@ToString

//@Data
//@Value

//@EqualsAndHashCode
//@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)

//@NonNull

@Getter
@Setter
@Accessors(prefix = "temp", chain = true)
public class TestClass {
//    @Getter
    int a = 10;
//    @Setter
    int b = 11;
}
