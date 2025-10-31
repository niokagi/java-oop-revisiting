package advance_uml.tasks;

public class Avatar {
}

public class Skill {
}

public class Quest {
}

public class Weapon {
}

public class Player {
    public Avatar avatar;
    public Skill skill;
    public Quest quest;

    public Player() {
        this.avatar = new Avatar();
    }

    public void learnSkill() {
        this.skill = new Skill();
    }

    public void takeQuest(Quest quest) {
        this.quest = quest;
    }

    public void attack(Weapon weapon) {
        // attack with weapon;
    }
}
