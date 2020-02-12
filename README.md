# stetho-okhttp-no-op

To add it to gradle see [![](https://jitpack.io/v/alexfrostdev/stetho-okhttp-no-op.svg)](https://jitpack.io/#alexfrostdev/stetho-okhttp-no-op/1.0)

You should exclude ```StethoInterceptor``` from release build like

```
    OkHttpClient.Builder builder = new OkHttpClient.Builder();

    if (BuildConfig.DEBUG) {
        builder.addNetworkInterceptor(new StethoInterceptor());
    }
``` 

## License

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
