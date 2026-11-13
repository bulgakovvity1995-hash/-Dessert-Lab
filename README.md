# Dessert Lab Android 1.2.1

Полный исходный Android-проект приложения Dessert Lab. Проект использует Android WebView и включает веб-версию в `app/src/main/assets/index.html`.

## Структура
- `app/` — Android-модуль приложения
- `app/src/main/assets/index.html` — интерфейс Dessert Lab
- `settings.gradle.kts` — подключение модуля `:app`
- `build.gradle.kts` — версии Android/Kotlin Gradle-плагинов
- `.github/workflows/android-apk.yml` — автоматическая сборка APK в GitHub Actions

## Сборка в GitHub Actions
Workflow запускается при push в `main`/`master` или вручную через Actions → Build Dessert Lab APK → Run workflow. Готовый APK будет в разделе Artifacts запуска.

Требуются JDK 17, Android SDK Platform 35 и Gradle 8.9; workflow устанавливает их автоматически.

## Сборка локально
Откройте корневую папку проекта в Android Studio с установленным Android SDK 35 и JDK 17, затем выполните Gradle Sync и Build APK.

## Примечание для загрузки ZIP на GitHub с телефона
GitHub сохраняет загруженный ZIP как обычный файл и сам его не распаковывает. Чтобы сборка сработала при загрузке только ZIP, в репозитории должен оставаться workflow `.github/workflows/android-apk.yml`, который распознаёт и распаковывает архив. Не удаляйте этот workflow до успешной первой сборки.
