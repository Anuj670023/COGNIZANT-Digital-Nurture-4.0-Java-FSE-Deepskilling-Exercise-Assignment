## HANDS ON Overview

### **1. Git Initialization & First Commit**
- Initialize a Git repository
- Configure user settings
- Make the first commit and push to remote
```bash
git init
git config --global user.name "Your Name"
git config --global user.email "your@email.com"
git add .
git commit -m "Initial commit"
git push origin master
```

### **2. Using .gitignore**
- Ignore unwanted files (`.log`, directories)
```bash
echo "*.log" > .gitignore
echo "log/" >> .gitignore
git add .gitignore
git commit -m "Add .gitignore"
```

### **3. Branching & Merging**
- Create, commit to, and merge branches
```bash
git branch new-feature
git checkout new-feature
# Make changes...
git checkout master
git merge new-feature
```

### **4. Resolving Merge Conflicts**
- Create and resolve conflicts
```bash
# Create conflicting changes in branches
git merge feature-branch
# Resolve conflicts in files
git add .
git commit -m "Resolved conflicts"
```

### **5. Clean Up & Final Push**
- Sync local and remote repositories
```bash
git pull origin master
git push origin master
git branch -d merged-branch
```

## Prerequisites
- Git installed
- GitLab/GitHub account
- Notepad++ (for Windows users)

## Setup
1. Clone this repository:
```bash
git clone https://gitlab.com/your-username/GitDemo.git
```
2. Configure Git:
```bash
git config --global core.editor "notepad++"
```

## Visualizing History
```bash
git log --oneline --graph --decorate --all
```

## Troubleshooting
- **Merge conflicts**: Edit conflicted files, then `git add` and `git commit`
- **Permission issues**: Verify remote URL with `git remote -v`
