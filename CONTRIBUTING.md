# Contributing to ForgeAI

First off, thank you for your interest in contributing to ForgeAI! 🎉

ForgeAI is an open-source platform for building production-ready AI applications, AI agents, workflows, and cloud-native AI systems. Every contribution—whether it's code, documentation, bug reports, or ideas—helps make the project better.

Please read this guide before contributing.

---

# Table of Contents

- Code of Conduct
- Ways to Contribute
- Getting Started
- Development Workflow
- Branch Naming
- Commit Message Guidelines
- Pull Request Process
- Coding Standards
- Testing
- Documentation
- Reporting Bugs
- Suggesting Features
- Security Issues
- Community

---

# Code of Conduct

By participating in this project, you agree to follow our Code of Conduct.

Please be respectful, welcoming, and constructive in all interactions.

---

# Ways to Contribute

There are many ways to contribute:

- Fix bugs
- Implement new features
- Improve documentation
- Improve examples
- Write tests
- Improve performance
- Improve accessibility
- Review pull requests
- Report issues
- Answer community questions

No contribution is too small.

---

# Getting Started

## 1. Fork the repository

Fork the ForgeAI repository into your GitHub account.

## 2. Clone your fork

```bash
git clone https://github.com/<your-username>/forgeai.git

cd forgeai
```

## 3. Add upstream

```bash
git remote add upstream https://github.com/ForgeAI/forgeai.git
```

Verify:

```bash
git remote -v
```

---

## 4. Create a new branch

Never work directly on `main`.

Create a feature branch:

```bash
git checkout -b feature/my-awesome-feature
```

---

## 5. Install dependencies

Follow the setup instructions in the project README.

---

## 6. Make your changes

Keep changes focused.

Avoid unrelated formatting changes.

---

## 7. Run tests

Before submitting your PR:

```bash
# Example

npm test

# or

mvn test

# or

./gradlew test
```

All tests must pass.

---

## 8. Commit

Use meaningful commit messages.

Example:

```text
feat(agent): add Azure OpenAI streaming support
```

---

## 9. Push

```bash
git push origin feature/my-awesome-feature
```

---

## 10. Open a Pull Request

Submit a PR against the `main` branch.

---

# Development Workflow

```
Fork

↓

Clone

↓

Create Feature Branch

↓

Develop

↓

Run Tests

↓

Commit

↓

Push

↓

Open Pull Request

↓

Code Review

↓

Merge
```

---

# Branch Naming

Use one of the following prefixes:

```
feature/
bugfix/
hotfix/
docs/
refactor/
test/
release/
experiment/
```

Examples

```
feature/chat-memory

feature/rag-search

bugfix/token-expiry

docs/getting-started

refactor/agent-runtime

test/api-auth
```

---

# Commit Message Guidelines

We follow the Conventional Commits specification.

Examples:

```
feat(agent): add memory persistence

fix(api): handle null response

docs: improve installation guide

refactor(core): simplify dependency injection

test(chat): add integration tests

ci: update GitHub Actions

perf(search): improve vector lookup speed
```

Types:

- feat
- fix
- docs
- style
- refactor
- perf
- test
- build
- ci
- chore

---

# Pull Request Process

Every PR should:

- Solve a single problem
- Include clear descriptions
- Pass all CI checks
- Include tests if applicable
- Update documentation if needed

Before submitting:

- Code builds successfully
- Tests pass
- Documentation updated
- No merge conflicts
- Branch is up to date

---

# Code Review

Maintainers may request:

- Code improvements
- Refactoring
- Additional tests
- Better documentation

Please respond constructively.

---

# Coding Standards

## General

- Write readable code.
- Prefer simplicity.
- Avoid unnecessary complexity.
- Follow existing project patterns.

---

## Naming

Use meaningful names.

Good:

```java
conversationHistory
```

Avoid:

```java
x
tmp
abc
```

---

## Functions

Functions should:

- Do one thing
- Be easy to understand
- Have descriptive names

---

## Comments

Comment *why*, not *what*.

Good:

```java
// Retry because Azure OpenAI occasionally returns transient failures.
```

Avoid:

```java
// Increment i
i++;
```

---

# Testing

Every new feature should include tests whenever practical.

Recommended:

- Unit tests
- Integration tests
- End-to-end tests (if applicable)

Do not merge code that breaks existing tests.

---

# Documentation

Documentation is just as important as code.

Please update documentation whenever you:

- Add features
- Remove functionality
- Change APIs
- Modify configuration
- Add dependencies

---

# Reporting Bugs

Before opening a bug report:

- Search existing issues
- Confirm you're using the latest version
- Include reproduction steps

A good bug report includes:

- Environment
- Expected behavior
- Actual behavior
- Logs
- Screenshots (if applicable)

---

# Suggesting Features

Feature requests should explain:

- The problem
- Proposed solution
- Alternative solutions
- Additional context

Please avoid feature requests without clear use cases.

---

# Security Issues

**Do not report security vulnerabilities publicly.**

Instead, follow the instructions in `SECURITY.md`.

---

# Good First Issues

New contributors can start with issues labeled:

- good first issue
- help wanted

These are designed to be approachable.

---

# Community

Be respectful.

Be collaborative.

Be patient.

We value:

- Kindness
- Curiosity
- Learning
- Constructive feedback

---

# License

By contributing to ForgeAI, you agree that your contributions will be licensed under the same license as the project.

---

Thank you for helping make ForgeAI better! 🚀