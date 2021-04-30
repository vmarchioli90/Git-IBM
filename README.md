Este curso ensina a usar o Git do básico ao avançado com os seguintes comandos:
git config --global user.email “Seu Email” => Setar email

git config --global core.excludesfile ~/.gitignore => Setar arquivos a serem ignorados

git config –list => Listar configurações

git init => Criar novo repositório

git status => Verificar estado dos arquivos/diretórios

git add arquivo.txt => Adicionar um arquivo em específico

git add meu_diretorio => Adicionar um diretório em específico

git add . ou git add -A => Adicionar todos os arquivos/diretórios
	
git add -f arquivo_no_gitignore.txt => Adicionar um arquivo que esta listado no .gitignore
git commit arquivo.txt => Comitar um arquivo
git commit arquivo.txt outro_arquivo.txt => Comitar vários arquivos

git commit meuarquivo.txt -m "minha mensagem de commit" => Comitar informando mensagem

git rm arquivo.txt => Remover arquivo
git rm -r diretorio => Remover diretório

git log => Exibir histórico
git log -p -2 => Exibir histórico com diff das duas últimas alterações

git log –stat => Exibir resumo do histórico (hash completa, autor, data, comentário e qtde de alterações (+/-))
git log --pretty=oneline => Exibir informações resumidas em uma linha (hash completa e comentário)


git log -- <caminho_do_arquivo> => Exibir histório de um arquivo específico

git log --summary -S<palavra> [<caminho_do_arquivo>] => Exibir histórico de um arquivo específico que contêm uma determinada palavra
git log --diff-filter=M -- <caminho_do_arquivo> => Exibir histórico modificação de um arquivo
git log --author=usuario => Exibir histório de um determinado autor

git blame -L 12,22 meu_arquivo.txt = Exibir revisão e autor da última modificação de uma bloco de linhas

Desfazendo operações
Desfazendo alteração local (working directory)
Este comando deve ser utilizando enquanto o arquivo não foi adicionado na staged area.
git checkout --arquivo.txt => Desfazendo alteração local (working directory) -- Este comando deve ser utilizando enquanto o arquivo não foi adicionado na staged area

Desfazendo alteração local (staging area)
git reset HEAD meu_arquivo.txt => Desfazendo alteração local (staging area) -- Este comando deve ser utilizando quando o arquivo já foi adicionado na staged area

git checkout meu_arquivo.txt => Alteração do diretório
Exibir os repositórios remotos
git remote => Exibir os repositórios remotos
git remote -v => Exibir os repositórios remotos

git remote add origin git@github.com:nomedeusuario/curso-git.git => Vincular repositório local com um repositório remoto

git remote show origin => Exibir informações dos repositórios remotos
git remote rename origin curso-git => Renomear um repositório remoto

git remote rm curso-git => Desvincular um repositório remoto

git push -u origin master => Enviar arquivos/diretórios para o repositório remoto

git push => Depois do (git push -u origin master) configurado
git pull => Atualizar os arquivos no branch atual

git fetch => Buscar as alterações, mas não aplica-las no branch atual

Clonar um repositório remoto já existente
git clone git@github.com:nomedousuario/curso-git.git => Clonar um repositório remoto já existente

git tag -a vs-1.1 -m "Minha versão 1.1" => Criando uma tag anotada

git tag -s vs-1.1 -m "Minha tag assinada 1.1" => Criando uma tag assinada

git tag -a vs-1.2 9fceb02 => Criando tag a partir de um commit (hash)

git push origin vs-1.2 => Criando tags no repositório remoto

git push origin –tags => Criando todas as tags locais no repositório remoto

git branch bug-123 => Criando um novo branch

Trocando para um branch existente
git checkout bug-123 => Trocando para um branch existente

Criar um novo branch e trocar
git checkout -b bug-456 => Criar um novo branch e trocar

git checkout master => Voltar para o branch principal (master)

Resolver merge entre os branches
git merge bug-123 => Resolver merge entre os branches

Para realizar o merge, é necessário estar no branch que deverá receber as alterações. O merge pode automático ou manual. O merge automático será feito em arquivos textos que não sofreram alterações nas mesmas linhas, já o merge manual será feito em arquivos textos que sofreram alterações nas mesmas linhas.
git branch -d bug-123 => Apagando um branch

git branch => Listar branches

git branch -v => Listar branches com informações dos últimos commits

git branch –merged = > Listar branches que já foram fundidos (merged) com o master

git branch --no-merged => Listar branches que não foram fundidos (merged) com o master
git push origin bug-123 => Criando um branch remoto com o mesmo nome

git push origin bug-123:new-branch => Criando um branch remoto com nome diferente
git checkout -b bug-123 origin/bug-123 => Baixar um branch remoto para edição
git push origin:bug-123 => Apagar branch remoto

Fazendo o rebase entre um o branch bug-123 e o master.
git checkout experiment

git rebase master
git stash
git stash list => Listar stashes
git stash apply => Voltar para o último stash
git stash apply stash@{} => Voltar para um stash específico
git stash branch meu_branch => Criar um branch a partir de um stash

git commit --amend -m "Minha nova mensagem" => Alterando mensagens de commit
git rebase -i HEAD~3 => Alterar os três últimos commits
git bisect start => Iniciar pequinsa binária
git bisect bad => Marcar o commit atual como ruim
git bisect good vs-1.1 => Marcar o commit de uma tag que esta sem o bug/inconsistência
git bisect good => Marcar o commit como bom
git bisect bad => Marcar o commit como ruim
git bisect reset => Finalizar a pesquisa binária




