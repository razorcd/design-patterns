
### Works like this:

```
UserProfileClient -.----> UserProfileDb (implements UserProfile)
                   |
                   '----> UserProfileExternalAdapter (implements UserProfile)  ----> UserProfileExternal
```                    

### Description:

- converts a class to another class to implement a different interface
- usually works with legacy code to provide a different interface
- it is built after the code it adapts
- adding extra methods/feature to the addaptor would also make it a decorator
- it is different from Bridge DP because the Bridge works with new code (ex: Drivers)