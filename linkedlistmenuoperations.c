#include<stdio.h>
#include<stdlib.h>
struct node{
 int data;
 struct node *next;
};
//insert at Beginning
struct node* insertBegin(struct node *head,int data){
  struct node *newnode=(struct node*)malloc(sizeof(struct node));
  newnode->data=data;
  if(head==NULL){
   newnode->next=NULL;
   head=newnode;
  }
  else{
   newnode->next=head;
   head=newnode;
  }
  printf("Inserted Successfully\n");
  return head;
}
//insert at End
struct node* insertEnd(struct node *head,int data){
  struct node *newnode=(struct node*)malloc(sizeof(struct node));
  struct node *temp;
    newnode->data = data;
    newnode->next = NULL;
    if (head == NULL) {
        head = newnode;
    }
    else {
        temp = head;
        while (temp->next != NULL)
            temp = temp->next;

        temp->next = newnode;
    }

    printf("Inserted Successfully\n");
    return head;
 }
 // Insert at Position
struct node* insertPosition(struct node *head, int data, int pos) {

    struct node *newnode, *temp;
    int i;

    if (pos <= 0) {
        printf("Invalid Position\n");
        return head;
    }

    newnode = (struct node*)malloc(sizeof(struct node));
    newnode->data = data;

    if (pos == 1) {
        newnode->next = head;
        return newnode;
    }

    temp = head;

    for (i = 1; i < pos - 1 && temp != NULL; i++)
        temp = temp->next;

    if (temp == NULL) {
        printf("Invalid Position\n");
        return head;
    }

    newnode->next = temp->next;
    temp->next = newnode;

    printf("Inserted at Position %d\n", pos);
    return head;
}
// Delete from Beginning
struct node* deleteBegin(struct node *head) {

    struct node *temp;

    if (head == NULL) {
        printf("List is Empty\n");
        return head;
    }
    else {
        temp = head;
        head = head->next;
        free(temp);
        printf("Deleted Successfully\n");
        return head;
    }
}
// Delete from End
struct node* deleteEnd(struct node *head) {

    struct node *temp, *prev;

    if (head == NULL) {
        printf("List is Empty\n");
        return head;
    }

    if (head->next == NULL) {
        free(head);
        printf("Deleted Successfully\n");
        return NULL;
    }

    temp = head;
    while (temp->next != NULL) {
        prev = temp;
        temp = temp->next;
    }

    prev->next = NULL;
    free(temp);

    printf("Deleted Successfully\n");
    return head;
}
// Delete from Position
struct node* deletePosition(struct node *head, int pos) {

    struct node *temp, *prev;
    int i;

    if (head == NULL) {
        printf("List is Empty\n");
        return head;
    }

    if (pos <= 0) {
        printf("Invalid Position\n");
        return head;
    }

    if (pos == 1) {
        temp = head;
        head = head->next;
        free(temp);
        return head;
    }

    temp = head;

    for (i = 1; i < pos && temp != NULL; i++) {
        prev = temp;
        temp = temp->next;
    }

    if (temp == NULL) {
        printf("Invalid Position\n");
        return head;
    }

    prev->next = temp->next;
    free(temp);

    printf("Deleted from Position %d\n", pos);
    return head;
}
//Traversal
void display(struct node *head) {

    struct node *temp;

    if (head == NULL) {
        printf("List is Empty\n");
        return;
    }

    temp = head;
    printf("Linked List: ");
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}
//main function
int main() {

    struct node *head = NULL;
    int choice, subchoice;
    int data, pos;

    while (1) {

        printf("\n===== MAIN MENU =====\n");
        printf("1. Insert\n");
        printf("2. Delete\n");
        printf("3. Traversal\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {

        case 1:
            printf("Enter data: ");
            scanf("%d", &data);

            printf("\n--- INSERT MENU ---\n");
            printf("1. Beginning\n");
            printf("2. End\n");
            printf("3. Position\n");
            printf("Enter choice: ");
            scanf("%d", &subchoice);

            if (subchoice == 1)
                head = insertBegin(head, data);

            else if (subchoice == 2)
                head = insertEnd(head, data);

            else if (subchoice == 3) {
                printf("Enter position: ");
                scanf("%d", &pos);
                head = insertPosition(head, data, pos);
            }
            else
                printf("Invalid Choice\n");

            break;

        case 2:
            printf("\n--- DELETE MENU ---\n");
            printf("1. Beginning\n");
            printf("2. End\n");
            printf("3. Position\n");
            printf("Enter choice: ");
            scanf("%d", &subchoice);

            if (subchoice == 1)
                head = deleteBegin(head);

            else if (subchoice == 2)
                head = deleteEnd(head);

            else if (subchoice == 3) {
                printf("Enter position: ");
                scanf("%d", &pos);
                head = deletePosition(head, pos);
            }
            else
                printf("Invalid Choice\n");

            break;

        case 3:
            display(head);
            break;

        case 4:
            exit(0);

        default:
            printf("Invalid Choice\n");
        }
    }

    return 0;
}


