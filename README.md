# Aluvery

Aluvery é um projeto de estudo para aprender e praticar o uso do Jetpack Compose no desenvolvimento de aplicativos Android. Este projeto é desenvolvido em Kotlin e utiliza o Gradle como sistema de build.

## Tecnologias Utilizadas

- **Kotlin**: Linguagem de programação principal.
- **Jetpack Compose**: Framework para construção de interfaces de usuário declarativas.
- **Material3**: Biblioteca de componentes de interface do usuário.
- **Gradle**: Sistema de automação de build.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- `app/src/main/java/com/example/aluvery/MainActivity.kt`: Contém a atividade principal do aplicativo.
- `app/src/main/java/com/example/aluvery/ui/theme/`: Contém os arquivos relacionados ao tema do aplicativo.

## Funcionalidades

- Exibe uma saudação personalizada utilizando o Jetpack Compose.
- Utiliza o tema Material3 para estilização da interface.

## Como Executar

1. Clone o repositório:
    ```sh
    git clone https://github.com/robsondmf1234/aluvery.git
    ```
2. Abra o projeto no Android Studio.
3. Conecte um dispositivo Android ou inicie um emulador.
4. Execute o aplicativo.

## Exemplo de Código

```kotlin
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
```

## Pré-visualização

Para pré-visualizar a interface no Android Studio, utilize a anotação `@Preview`:

```kotlin
@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun GreetingPreview() {
    AluveryTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Greeting("Android")
        }
    }
}
```

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

## Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo `LICENSE` para mais detalhes.