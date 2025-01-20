# Class to represent a contact
class Contact:
    def __init__(self, name, phone, email):
        self.name = name  # Store the contact's name
        self.phone = phone  # Store the contact's phone number
        self.email = email  # Store the contact's email address

    def __str__(self):
        # This method returns a string representation of the contact
        return f"{self.name}: {self.phone}, {self.email}"


# Class to manage the contact book (add, remove, and list contacts)
class ContactBook:
    def __init__(self):
        self.contacts = []  # Initialise an empty list to store contacts

    def add_contact(self, contact):
        # Add a new contact to the contact list
        self.contacts.append(contact)
        print(f"Added contact: {contact}")

    def remove_contact(self, name):
        #remove a contact by name
        for contact in self.contacts:
            if contact.name == name:
                self.contacts.remove(contact)
                print(f"Removed contact: {contact}")
                return
        print(f"Contact not found: {name}")

    def list_contacts(self):
        # List all the contacts in the contact book
        if self.contacts:
            print("Contacts:")
            for contact in self.contacts:
                print(contact)
        else:
            print("No contacts to display.")


# Create a ContactBook instance
contact_book = ContactBook()


contact_book.add_contact(Contact("Amira Ali", "020 7946 0958", "amira.ali@example.co.uk"))
contact_book.add_contact(Contact("John Smith", "020 7946 2310", "john.smith@example.co.uk"))
contact_book.add_contact(Contact("Raj Patel", "020 7946 1423", "raj.patel@example.co.uk"))
contact_book.add_contact(Contact("Emily Williams", "020 7946 2931", "emily.williams@example.co.uk"))
# List all contacts
contact_book.list_contacts()

# Remove a contact
contact_book.remove_contact("Raj Patel")

# List contacts after removal
contact_book.list_contacts()
