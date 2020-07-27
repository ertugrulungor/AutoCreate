[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.ertugrulungor/AutoCreate/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.ertugrulungor/AutoCreate)

# AutoCreate

A simple object creation library for unit tests


## Installation

Apache Maven

```xml
<dependency>
    <groupId>com.github.ertugrulungor</groupId>
    <artifactId>AutoCreate</artifactId>
    <version>1.0.0</version>
</dependency>
```

Gradle
```java
compile 'com.github.ertugrulungor:AutoCreate:1.0.0'
```

## Usage

```java
//GIVEN
MyRequest request = AutoCreate.build(MyRequest.class)
                              .with(x -> x.setMyProperty("test")
                              .create();

//WHEN
String response = myClass.myAwesomeMethod(request);

//THEN
assertEquals("myString", response);
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)
