# 📱 Projeto Android: Transferência com 3 Activities

Este é um aplicativo Android simples com três telas (Activities), onde o usuário pode **incrementar ou decrementar um valor numérico** e navegar entre as telas mantendo esse valor atualizado.

## 🚀 Funcionalidades

- ✅ Tela 1 (MainActivity):
  - Exibe o valor atual.
  - Permite incrementar e decrementar com botões `+` e `-`.
  - Botão para ir à próxima tela, enviando o valor atual.

- ✅ Tela 2 (PrincipalActivity):
  - Recebe o valor da tela anterior.
  - Permite alterações no número com botões `+` e `-`.
  - Botão para ir à próxima tela, enviando o novo valor.

- ✅ Tela 3 (TransferenciaActivity):
  - Recebe o valor da tela 2.
  - Permite continuar incrementando ou decrementando.
  - Exibe o valor de forma destacada.
  - Botão para voltar à Tela 1, mantendo o valor atualizado.

## 🧱 Estrutura do Projeto

- `MainActivity.java` → Primeira tela
- `PrincipalActivity.java` → Segunda tela
- `TransferenciaActivity.java` → Terceira tela
- `activity_main.xml`, `activity_principal.xml`, `activity_transferencia.xml` → Layouts das telas

## 🛠️ Tecnologias Utilizadas

- Java
- Android SDK (API 34)
- ConstraintLayout
- FloatingActionButton (Material Components)

## 📦 Como Executar

1. Clone o projeto:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
