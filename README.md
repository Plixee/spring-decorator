## spring-decorator

*spring-decorator* is a Spring 3 application implementing the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

### Story
In order to demonstrate the power of the decorator pattern, we create a message service which is used to send text messages. We decorate this service in order to check that the user is authorized to perform the action.

### Testing
This pattern enables us to test each function independently (a test for the impl, a test for the authorizations).

### Configuration
We also wrote a Spring app config in order to show how to create a decorated Bean. This service can then be injected in the other Beans.

### License
See the [LICENSE](https://github.com/Plixee/spring-decorator/blob/master/LICENSE) file.