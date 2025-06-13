# 🎲 RandomAdminTeleport

**A simple Minecraft Paper plugin that lets admins teleport to a random online player with a single command.**

---

## 📦 Features

- ✅ Easy-to-use command: `/rtpadmin`
- ✅ Automatically excludes the command sender from random selection
- ✅ Admins only (permission-controlled)
- ✅ Works with Paper 1.20+

---

## 📋 Command Usage

### `/rtpadmin`

- Teleports the admin who runs the command to a randomly selected online player.
- Excludes the admin themselves from the random pool.

---

## 🔐 Permissions

| Permission            | Description                                 | Default |
|-----------------------|---------------------------------------------|---------|
| `randomteleport.use`  | Allows the user to use `/rtpadmin` command  | OP only |

---

## ⚙️ Installation

1. Download the latest release JAR from the [Releases](https://github.com/Zarathale/RandomAdminTeleport/releases) page (or build it yourself using Maven).
2. Place the `.jar` file into your Minecraft server’s `plugins/` directory.
3. Restart the server or use `/reload`.


---

## 🧪 Requirements

- Java 17+
- PaperMC 1.20+ (or any Paper-compatible fork)
- Maven (for building from source)

---

## 🛠 Building from Source

Clone the repository:

```bash
git clone https://github.com/Zarathale/RandomAdminTeleport.git
cd RandomAdminTeleport
mvn clean package
