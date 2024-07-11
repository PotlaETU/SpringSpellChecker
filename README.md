# Spring Spell Checker

This project is a spell checker that uses AI to find and correct spelling mistakes in a text. 
It uses [Llama3](https://llama.meta.com/llama3/), a language model created by Meta.
Everything is hosted locally, so no data is sent to any server.

Port used is `11050`

## Tools used

- Spring Boot
- [Ollama](https://olama.com/)
- Docker

## Installation

1. Clone the repository 
```bash
git clone https://github.com/PotlaETU/SpellSpringChecker.git
```

2. Launch app using Docker

```bash
docker-compose up -d --build
```