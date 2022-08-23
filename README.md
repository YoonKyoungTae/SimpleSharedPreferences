# Deprecated
이 라이브러리는 더이상 지원하지 않습니다.

# SimpleSharedPreferences
'SimpleSharedPreferences'는 Android의 SharedPreference를 간편하게 사용할 수 있게 도와주는
유틸 라이브러리입니다.

## Gradle 사용법
**Gradle Dependencies**
~~~
//프로젝트 단위의 build.gradle에 jitpack 저장소를 추가합니다.
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}

//앱 단위의 build.gradle에 SimpleSharedPreferences 를 추가합니다.
dependencies {
    implementation 'com.github.YoonKyoungTae:SimpleSharedPreferences:1.1'
}
~~~

## 사용법
### 초기화
기능을 사용하기 전 필수로 *init()* 을 호출하여줍니다.
~~~
SSP.init(Context);
~~~
 
### PUT
값을 입력하는 방법은 *openEdit()* 으로 Editor를 열어주고 *put()* 을 호출 후, *commit()* or *apply()* 로 마무리해줍니다.
*commit()* 과 *apply()* 는 기존의 Preference 와 동일합니다.
~~~
SSP.openEdit().put(key, value).commit();
~~~

*put()* 메서드는 여러번 호출 가능하여 여러값을 한번에 넣을 수 있습니다.
~~~
SSP.openEdit()
    .put(key, value)
    .put(key, value)
    .put(key, value)
    .put(key, value)
    .....
    .commit();
~~~

좀 더 명확한 입력을 하고 싶은 경우 value의 타입을 지정할 수 있습니다.
~~~
SSP.openEdit()
    .putString(key, value)
    .putLong(key, value)
    .putInt(key, value)
    .putBoolean(key, value)
    .putStringSet(key, value)
    .....
    .commit();
~~~

### GET
각 변수 타입으로 get을 호출하여 사용합니다.
~~~
String a = SSP.getString(key, defaultValue);
long b = SSP.getLong(key, defaultValue);
int c = SSP.getInt(key, defaultValue);
float d = SSP.getFloat(key, defaultValue);
boolean e = SSP.getBoolean(key, defaultValue);
Set<String> f = SSP.getStringSet(key, defaultValue);
~~~
