del build\libs\*.jar

call gradlew build

if EXIST build\libs\*.jar (copy build\libs\*.jar C:\project\)
else (
    echo Bląd: plik nie istnieje. Kompilacja nie powiodła się.
)
